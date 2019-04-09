package backend;

import backend.dataset.Dataset;
import backend.dataset.Image;

public class Model {

	protected double accuracy;	
	protected Dataset dataset;
	protected String date;
	protected String name;
	protected double test_proportion;
	protected double training_step;
	protected long epoc;
	protected long batch_size;

	/**
	 * 
	 * @param model_file_path
	 */
	public Model(String model_file_path) {
		// TODO - implement Model.Model
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param dataset
	 */
	public Model(String name, Dataset dataset) {
		// TODO - implement Model.Model
		throw new UnsupportedOperationException();
	}

	public void saveToDisk() {
		// TODO - implement Model.saveToDisk
		throw new UnsupportedOperationException();
	}

	public double evaluate() {
		// TODO - implement Model.evaluate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param batchSize
	 * @param trainingSteps
	 * @param steps
	 */
	public void train(long batchSize, double trainingSteps, long steps) {
		// TODO - implement Model.train
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param image
	 */
	public double run(Image image) {
		// TODO - implement Model.run
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param imageList
	 */
	public double runBatch(java.util.LinkedList<Image> imageList) {
		// TODO - implement Model.runBatch
		throw new UnsupportedOperationException();
	}

}