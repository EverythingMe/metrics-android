package com.codahale.metrics;


/**
 * A metric which calculates the distribution of a value.
 *
 * @see <a href="http://www.johndcook.com/standard_deviation.html">Accurately computing running
 *      variance</a>
 */
public abstract class Histogram implements Metric, Sampling, Counting {

    /**
     * Adds a recorded value.
     *
     * @param value the length of the value
     */
    public abstract void update(int value);

    /**
     * Adds a recorded value.
     *
     * @param value the length of the value
     */
    public abstract void update(long value);

    /**
     * Returns the number of values recorded.
     *
     * @return the number of values recorded
     */
    @Override
    public abstract long getCount();

    @Override
    public abstract Snapshot getSnapshot();
}
