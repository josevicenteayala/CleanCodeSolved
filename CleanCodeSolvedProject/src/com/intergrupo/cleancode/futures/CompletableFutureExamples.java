package com.intergrupo.cleancode.futures;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExamples {
    public static void main(String[] args) {
        completableTaskOriginal();

        /*Calculating amount in dollar*/
        CompletableFuture<Double> doubleCompletableFuture = dollarLater.thenCombine(amountAccount, (dollar, amount) -> dollar * amount);
        try {
            System.out.println(doubleCompletableFuture.get());
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void completableTaskOriginal() {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(
                ()->{
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "Response after complete the process";
                }
                );
        try{
            System.out.println(completableFuture.get());
        } catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }


    static CompletableFuture<Double> dollarLater = CompletableFuture.supplyAsync(()->{
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
        return 3.9;
    });

    static CompletableFuture<Double> amountAccount = CompletableFuture.supplyAsync(()->{
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
        return 10.0;
    });
}
