package mulan.evaluation;

/**
 * Class representing the ground truth for a multi-target prediction problem. The ground truth is
 * either a boolean vector (for classification problems) or a double vector (for regression
 * problems).
 * 
 * @author Eleftherios Spyromitros-Xioufis
 * 
 */
public class GroundTruth {

    private Boolean[] trueLabels;

    private double[] trueValues;

    public GroundTruth(Boolean[] trueLabels) {
        this.trueLabels = trueLabels;
    }

    public GroundTruth(boolean[] trueLabels) {
        this.trueLabels = new Boolean[trueLabels.length];
        for(int i=0;i<trueLabels.length;i++){
        	trueLabels[i]=trueLabels[i];
        }
    }
    
    public GroundTruth(double[] trueValues) {
        this.trueValues = trueValues;
    }
    
    

    /**
     * Determines whether the {@link GroundTruth} is for a classification problem.
     * 
     * @return <code>true</code> if is classification; otherwise <code>false</code>
     */
    public boolean isClassification() {
        return (trueLabels != null);
    }

    /**
     * Determines whether the {@link GroundTruth} is for a regression problem.
     * 
     * @return <code>true</code> if is regression; otherwise <code>false</code>
     */
    public boolean isRegression() {
        return (trueValues != null);
    }

    public Boolean[] getTrueLabels() {
        return trueLabels;
    }

    public double[] getTrueValues() {
        return trueValues;
    }
}
