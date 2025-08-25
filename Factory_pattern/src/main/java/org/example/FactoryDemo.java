package org.example;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("Blog");
        System.out.println(site != null ? site.getPages() : null);

        site = WebsiteFactory.getWebsite("Shop");
        System.out.println(site != null ? site.getPages() : null);
    }
}
