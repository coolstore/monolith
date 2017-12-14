package com.redhat.coolstore;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.redhat.coolstore.utils.HibernateExporter;

public class HibernateExporterTest {

  @Test
  public void printSchema() {
    assertTrue(true);
    HibernateExporter exporter = new HibernateExporter("org.hibernate.dialect.H2Dialect", "com.redhat.coolstore.model");
    // HibernateExporter exporter = new HibernateExporter("org.hibernate.dialect.MySQL5Dialect", "com.redhat.coolstore.model");
    exporter.exportToConsole();
  }

}