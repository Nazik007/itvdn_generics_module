import java.net.URL;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

class GooSearchResult {

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    private String url;

    public String parseDomain() {
        try {
            URL url1 = new URL(getUrl());
            return url1.getHost();
        }catch (Exception e){
            return e.getMessage();
        }
    }


}