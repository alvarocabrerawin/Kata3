package kata3;
import org.jfree.ui.ApplicationFrame;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay(String title) {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    
    
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel (createChart(createDatase()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }

    
    
    public void execute(){
        setVisible(true);
    }

    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
                return chart;
    }

    
    private DefaultCategoryDataset createDatase() {
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        dataSet.addValue(7, "","gmail.com");
        
        dataSet.addValue(8, "","ulpgc.es");
        
        dataSet.addValue(9, "","ull.es");
        
        dataSet.addValue(10, "","hotmail.com");
        
        return dataSet;
    }

}
    

