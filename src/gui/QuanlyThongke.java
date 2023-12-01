/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javafx.concurrent.Task;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;

/**
 *
 * @author ASUS
 */
public class QuanlyThongke {
   private final ThongkeServiceImpl thongkeService=new ThongkeServiceImpl();

    public QuanlyThongke() {
       
    }
    public void setData1(JPanel jpnItem){
        ArrayList<SoluongBean> listItem = thongkeService.getListsoluong();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (SoluongBean item : listItem) {
                dataset.addValue(item.getSoluong(), "NHÂN VIÊN", item.getChucvu());
            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng nhân viên theo chức vụ".toUpperCase(),
                "Chức vụ", "Số lượng",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 900));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

   public void setData2(JPanel jpnItem){
        ArrayList<LuongBean> listItem = thongkeService.getListluong();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (LuongBean item : listItem) {
                dataset.addValue(Double.parseDouble(item.getLuong()), "NHÂN VIÊN", item.getChucvu());
            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê mức lương nhân viên theo chức vụ".toUpperCase(),
                "Chức vụ", "Mức lương",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 900));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
    }
   

