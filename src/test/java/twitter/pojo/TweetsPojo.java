package twitter.pojo;



public class TweetsPojo {
    private  MetaPojo meta;
    private  Object data;

    public MetaPojo getMeta() {
        return meta;
    }

    public void setMeta(MetaPojo meta) {
        this.meta = meta;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
