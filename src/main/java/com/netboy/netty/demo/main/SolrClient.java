package com.netboy.netty.demo.main;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.LBHttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

public class SolrClient {

	public static void main(String[] args) throws SolrServerException, IOException {
		String urlString = "http://10.232.132.185:8999/merge/";
		LBHttpSolrClient solrClient = new LBHttpSolrClient(urlString);
		SolrQuery parameters = new SolrQuery();
		parameters.set("q", "auction_id:7597135280");
		QueryResponse response = solrClient.query(parameters);
		SolrDocumentList list = response.getResults();
		for(SolrDocument doc : list){
			System.out.println(doc.toString());
		}
		parameters = new SolrQuery("user_id:79037580");
		response = solrClient.query(parameters);
		for(SolrDocument doc : response.getResults()){
			System.out.println(doc.toString());
		}
	}

}
