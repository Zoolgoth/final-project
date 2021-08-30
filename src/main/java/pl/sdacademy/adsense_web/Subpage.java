package pl.sdacademy.adsense_web;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Subpage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String link="<script async src=\"https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-2142907816927614\"\n" +
            "     crossorigin=\"anonymous\"></script>";


    @ElementCollection
    private List<LocalDate> dates = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public List<LocalDate> getDates() {
        return dates;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDates(List<LocalDate> dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Subpage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dates=" + dates +
                '}';
    }
}