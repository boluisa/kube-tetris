package com.vmware.borathon;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create MigrationController and nodes and containers
        MigrationController migrationController = new MigrationControllerImpl();
        List<Node> inputNodes = NodeDataGenerator.generate(5, 300);
        inputNodes.forEach(node -> migrationController.addNode(node));
        PodPlacementService podPlacementService = new PodPlacementServiceImpl();
        podPlacementService.placeCapacity(new Capacity(1500, 1000), inputNodes);
    }
}
