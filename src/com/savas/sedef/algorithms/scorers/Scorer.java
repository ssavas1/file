package com.savas.sedef.algorithms.scorers;

import java.util.ArrayList;

import com.savas.sedef.structures.File;
import com.savas.sedef.structures.Node;

public interface Scorer {
	public double score(ArrayList<Node> nodes, ArrayList<File> files);
}
