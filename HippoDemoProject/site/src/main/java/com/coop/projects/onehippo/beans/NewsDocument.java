package com.coop.projects.onehippo.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="HippoDemoProject:newsdocument")
public class NewsDocument extends BaseDocument{

    public String getTitle() {
        return getProperty("HippoDemoProject:title");
    }
    
    public String getSummary() {
        return getProperty("HippoDemoProject:summary");
    }
    
    public Calendar getDate() {
        return getProperty("HippoDemoProject:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("HippoDemoProject:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("HippoDemoProject:image", HippoGalleryImageSetBean.class);
    }


}
