package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //given
        Product prod1 = new Product("T-Shirt");
        Product prod2 = new Product("Socks");
        Product prod3 = new Product("Jersey");
        Product prod4 = new Product("Hoodie");
        Product prod5 = new Product("Jeans");

        Item poz1 = new Item(prod1, new BigDecimal(15), 2, new BigDecimal(30));
        Item poz2 = new Item(prod2, new BigDecimal(29), 1, new BigDecimal(29));
        Item poz3 = new Item(prod1, new BigDecimal(16), 3, new BigDecimal(48));
        Item poz4 = new Item(prod4, new BigDecimal(16), 3, new BigDecimal(48));
        Item poz5 = new Item(prod3, new BigDecimal(16), 3, new BigDecimal(48));
        Item poz6 = new Item(prod5, new BigDecimal(16), 3, new BigDecimal(48));


        Invoice fra1 = new Invoice(".19123456");
        fra1.getItems().add(poz1);
        fra1.getItems().add(poz3);
        fra1.getItems().add(poz5);
        Invoice fra2 = new Invoice(".20789012");
        fra2.getItems().add(poz2);
        fra2.getItems().add(poz4);
        fra2.getItems().add(poz6);

        poz1.setInvoice(fra1);
        poz2.setInvoice(fra2);
        poz3.setInvoice(fra1);
        poz4.setInvoice(fra2);
        poz5.setInvoice(fra1);
        poz6.setInvoice(fra2);

        productDao.save(prod1);
        int prod1Id = prod1.getId();
        productDao.save(prod2);
        int prod2Id = prod2.getId();
        productDao.save(prod3);
        int prod3Id = prod3.getId();
        productDao.save(prod4);
        int prod4Id = prod4.getId();
        productDao.save(prod5);
        int prod5Id = prod5.getId();

        invoiceDao.save(fra1);
        invoiceDao.save(fra2);

        itemDao.save(poz1);
        int poz1Id = poz1.getId();
        itemDao.save(poz2);
        int poz2Id = poz2.getId();
        itemDao.save(poz3);
        int poz3Id = poz3.getId();
        itemDao.save(poz4);
        int poz4Id = poz4.getId();
        itemDao.save(poz5);
        int poz5Id = poz5.getId();
        itemDao.save(poz6);
        int poz6Id = poz6.getId();


        //clean up
        try {
            itemDao.deleteById(poz1Id);
            itemDao.deleteById(poz2Id);
            itemDao.deleteById(poz3Id);
            itemDao.deleteById(poz4Id);
            itemDao.deleteById(poz5Id);
            itemDao.deleteById(poz6Id);
            productDao.deleteById(prod1Id);
            productDao.deleteById(prod2Id);
            productDao.deleteById(prod3Id);
            productDao.deleteById(prod4Id);
            productDao.deleteById(prod5Id);
        } catch (Exception e) {
        }
    }
}