package com.codahale.metrics;

/**
 * An incrementing and decrementing counter metric.
 */
public abstract class Counter implements Metric, Counting {

	/**
     * Increment the counter by one.
     */
    public abstract void inc();

    /**
     * Increment the counter by {@code n}.
     *
     * @param n the amount by which the counter will be increased
     */
    public abstract void inc(long n);

    /**
     * Decrement the counter by one.
     */
    public abstract void dec();

    /**
     * Decrement the counter by {@code n}.
     *
     * @param n the amount by which the counter will be decreased
     */
    public abstract void dec(long n);

    /**
     * Returns the counter's current value.
     *
     * @return the counter's current value
     */
    @Override
    public abstract long getCount();
}
