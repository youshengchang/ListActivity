package org.example.androidsdk.demo.data;

import java.util.ArrayList;
import java.util.List;

import org.example.androidsdk.demo.R;

public class FlowerData {

	/**
	 * An array of flowers
	 */
	private List<Flower> Flowers = new ArrayList<Flower>();
	public List<Flower> getFlowers() {
		return Flowers;
	}

	public FlowerData() {
		addItem(new Flower("Azalea", R.drawable.california_snow, "Large double. Good grower, heavy bloomer. Early to mid-season, acid loving plants. Plant in moist well drained soil with pH of 4.0-5.5."));
		addItem(new Flower("Tibouchina Semidecandra", R.drawable.princess_flower, "Beautiful large royal purple flowers adorn attractive satiny green leaves that turn orange/red in cold weather. Grows to up to 18 feet, or prune annually to shorten."));
		addItem(new Flower("Hibiscus", R.drawable.haight_ashbury, "Blooms in summer, 20-35 inches high. Fertilize regularly for best results. Full sun, drought tolerant."));
	}

	private void addItem(Flower item) {
		Flowers.add(item);
	}

}
