package com;

import org.jsoup.nodes.Document;
import java.util.ArrayList;

public interface ResponseScanner {
    void scanSearchPage(Document doc);
    void scanAdvertPage(Document doc);
    ArrayList<Advert> getAdverts();
}