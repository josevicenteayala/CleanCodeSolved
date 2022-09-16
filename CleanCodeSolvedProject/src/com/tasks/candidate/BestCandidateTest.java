package com.tasks.candidate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BestCandidateTest {

    private BestCandidate bestCandidate = new BestCandidate();

    @Test
    void voteByACandidate() {

        Map<Integer, Candidate> candidates = new HashMap<>();
        candidates.put(0, new Candidate(0, "Mark0"));
        candidates.put(1, new Candidate(0, "Mark1"));
        candidates.put(2, new Candidate(0, "Mark2"));
        candidates.put(3, new Candidate(0, "Mark3"));
        candidates.put(4, new Candidate(0, "Mark4"));
        candidates.put(5, new Candidate(0, "Mark5"));
        candidates.put(6, new Candidate(0, "Mark6"));

        Map voteByACandidate = bestCandidate.voteByACandidate(candidates);
        System.out.println(voteByACandidate);
    }

    @Test
    void orderCandidatesDescendingMode() {

        Map<Integer, Candidate> candidates = new HashMap<>();
        Candidate candidate0 = new Candidate(1, "Peter");
        Candidate candidate1 = new Candidate(4, "Mark");
        Candidate candidate2 = new Candidate(2, "Sophi");
        Candidate candidate3 = new Candidate(3, "Julius");

        candidates.put(1,candidate0);
        candidates.put(2,candidate1);
        candidates.put(3,candidate2);
        candidates.put(4,candidate3);

        Map orderCandidatesDescendingMode = bestCandidate.orderCandidatesDescendingMode(candidates);
        System.out.println(orderCandidatesDescendingMode);
        orderCandidatesDescendingMode.entrySet().stream().forEach(System.out::println);


    }
}