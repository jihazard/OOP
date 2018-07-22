package oopAndDesignPattern.chapter5.SRP.list5_1;

import sun.net.www.http.HttpClient;

public class DataViewer_NOT_SRP {
    public void display(){
        String data = loadHtml();
        updateGui(data);
    }

    private void updateGui(String data) {
    }

    private String loadHtml() {

        return ";;";
    }


}
