package com.savas.sedef.algorithms.solutions;

import java.util.ArrayList;
import java.util.Collections;

import com.savas.sedef.structures.File;
import com.savas.sedef.structures.Node;

public class AlgorithmChip implements Solution {

	@Override
	public void solveFor(ArrayList<Node> nodes, ArrayList<File> files) {
		Collections.sort(nodes);
		Collections.sort(files);
		Collections.reverse(files);
	}

}
