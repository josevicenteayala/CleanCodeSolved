package com.tasks.candidate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestCandidate {

    public Map voteByACandidate(Map<Integer, Candidate> candidates){
        for(int voter = 0; voter < 4;voter++) {
            switch (voter){
                case 0:
                    candidates.get(0).setScore(3);
                    candidates.get(1).setScore(2);
                    candidates.get(2).setScore(1);
                    break;
                case 1:
                    candidates.get(1).setScore(3);
                    candidates.get(2).setScore(2);
                    candidates.get(3).setScore(1);
                    break;
                case 2:
                    candidates.get(2).setScore(3);
                    candidates.get(3).setScore(2);
                    candidates.get(4).setScore(1);
                    break;
                case 3:
                    candidates.get(4).setScore(3);
                    candidates.get(5).setScore(2);
                    candidates.get(6).setScore(1);
                    break;
            }
        }
        return orderCandidatesDescendingMode(candidates);
    }

    public Map orderCandidatesDescendingMode(Map<Integer, Candidate> candidates){
        return candidates.entrySet().stream().sorted(Map.Entry.<Integer, Candidate>comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> newValue,
                        LinkedHashMap::new));
    }


}
