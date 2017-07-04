package alejandroalfaro.example.com.news_app;

import android.graphics.drawable.Drawable;

/**
 * Created by alejandroalfaro on 3/07/17.
 */

public class News {

    private String mDescription;
    private String mTitle;
    private String mSource;
    private Drawable mNewsImage;

    // This is the constructor of the News object with four inputs: 3 Strings and 1 drawable
    public News (String description, String title, String source, Drawable newsImage){

        mDescription = description;
        mTitle = title;
        mSource = source;
        mNewsImage = newsImage;

    }

    public String getDescription(){
        return mDescription;
    }
    public String getTitle(){
        return mTitle;
    }
    public String getSource(){
        return mSource;
    }
    public Drawable getNewsImage(){
        return mNewsImage;
    }

    //This method represents the whole object as a string, usually for debugging purposes.
    @Override
    public String toString() {
        return "News{" +
                "mDescription ='" + mDescription + '\'' +
                ", mTitle ='" + mTitle + '\'' +
                ", mSource =" + mSource +
                '}';
    }


}
