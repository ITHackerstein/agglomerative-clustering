package com.davidecarella.hclus.common;

/**
 * Un clustering degli esempi.
 *
 * @param exampleCount il numero di esempi del clustering
 * @param steps il numero di passi del clustering
 *
 * @see ClusteringStep
 */
public record Clustering(int exampleCount, ClusteringStep[] steps) {
}