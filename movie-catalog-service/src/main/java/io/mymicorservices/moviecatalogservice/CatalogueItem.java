package io.mymicorservices.moviecatalogservice;

public class CatalogueItem {
    private String name,desc,ratings;

    public CatalogueItem(String name, String desc, String ratings) {
        this.name = name;
        this.desc = desc;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}
