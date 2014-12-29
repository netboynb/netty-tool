package com.netboy.netty.demo.main;

import java.net.MalformedURLException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.LBHttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

public class SolrClient {

	public static void main(String[] args) throws SolrServerException, MalformedURLException {
		String urlString = "http://10.232.132.185:8999/merge/";
		SolrServer solr = new LBHttpSolrServer(urlString);
		SolrQuery parameters = new SolrQuery();
		parameters.set("q", "auction_id:7597135280");
		QueryResponse response = solr.query(parameters);
		SolrDocumentList list = response.getResults();
		for(SolrDocument doc : list){
			System.out.println(doc.toString());
		}
		parameters = new SolrQuery("user_id:79037580");
		response = solr.query(parameters);
		for(SolrDocument doc : response.getResults()){
			System.out.println(doc.toString());
		}
	}

}
