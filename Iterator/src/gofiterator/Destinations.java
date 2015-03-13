package gofiterator;

public class Destinations implements Iterable{
	private String[] destinations;
	private int internal_index;
	private int maxNumberOfDestinations;
	
	/**
	 * Public constructor of Destinations
	 * @param maxNumberOfDestinations max length for array initialization
	 */
	public Destinations(int maxNumberOfDestinations) {
		internal_index = 0;
		this.maxNumberOfDestinations = maxNumberOfDestinations;
		destinations = new String[maxNumberOfDestinations];
	}

	/**
	 * Adds new destination into route.
	 * @param value new destination
	 */
	public void add(String value) {
		if (internal_index < maxNumberOfDestinations)
			destinations[internal_index++] = value;
		
	}

	@Override
	public Iterator createIterator() {
		return new DestinationsIterator(destinations);
	}

	// other Destinations methods here ...
}
