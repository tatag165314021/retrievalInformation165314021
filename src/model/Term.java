/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Term {
    private String term;
    private PostingList termList;
    private ArrayList<Posting> postingList=new ArrayList<Posting>();

    int getNumberOfDocument(){
        return postingList.size();
    }
    
    public ArrayList<Posting> getPostingList() {
        return postingList;
    }

    public void setPostingList(ArrayList<Posting> postingList) {
        this.postingList = postingList;
    }

    public Term(String term, PostingList termList) {
        this.term = term;
        this.termList = termList;
    }

    /**
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * @return the termList
     */
    public PostingList getTermList() {
        return termList;
    }

    /**
     * @param termList the termList to set
     */
    public void setTermList(PostingList termList) {
        this.termList = termList;
    }
    
}
