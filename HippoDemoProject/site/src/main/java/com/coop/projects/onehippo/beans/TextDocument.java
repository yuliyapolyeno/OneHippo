package com.coop.projects.onehippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="HippoDemoProject:textdocument")
public class TextDocument extends BaseDocument{
    
    public String getTitle() {
        return getProperty("HippoDemoProject:title");
    }

    public String getSummary() {
        return getProperty("HippoDemoProject:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("HippoDemoProject:body");    
    }

}
