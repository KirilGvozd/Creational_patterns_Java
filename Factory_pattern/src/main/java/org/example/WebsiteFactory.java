package org.example;

public class WebsiteFactory {
    public static Website getWebsite(String type) {
        return switch (type.toLowerCase()) {
            case "blog" -> new Blog();
            case "shop" -> new Shop();
            default -> null;
        };
    }
}
