package com.example.android.appnews;

public class News {
    private String mTitle;
    private String mSection;
    private String mUrl;
    private String mAuthor;
    private String mDate;

    public News(String Title, String Section,  String Url, String Date, String Author) {
        mTitle = Title;
        mSection = Section;
        mUrl = Url;
        mDate=Date;
      mAuthor=Author;
    }

    public String getTitle() {return mTitle;}
    public String getSection () {return mSection;}
    public String getUrl() {
        return mUrl;
    }
    public String getDate() {return mDate; }
    public String getAuthor() {return mAuthor;}

}

