package com.example.educate4;


public class Uploads {
    public String location;
    public String title;
    public String description;
    public String link;
    public String url;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Uploads() {
    }

    public Uploads(String title,String description,String link, String url,String location) {
        this.location=location;
        this.title = title;
        this.description=description;
        this.link=link;
        this.url = url;
    }

    public String getLocation(){return location; }

    public String getTitle() {
        return title;
    }

    public String getDescription(){return description; }

    public String getLink(){ return  link; }

    public  String getUrl() {
        return url;
    }
}
