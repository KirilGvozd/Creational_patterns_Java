package org.example;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new CartPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
