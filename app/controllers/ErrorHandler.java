package controllers;

import play.Logger;
import play.http.HttpErrorHandler;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.mvc.Results.ok;

public class ErrorHandler implements HttpErrorHandler {
    @Override
    public CompletionStage<Result> onClientError(Http.RequestHeader request, int statusCode, String message) {
        Logger.of(this.getClass().getName()).error("---==== Client ERROR ===---: " + message + " request: " + request.toString());
        return CompletableFuture.completedFuture(ok("client error, check the logs..."));
    }

    @Override
    public CompletionStage<Result> onServerError(Http.RequestHeader request, Throwable exception) {
        Logger.of(this.getClass().getName()).error("---==== Server ERROR ===---", exception);
        return CompletableFuture.completedFuture(ok("server error, check the logs..."));
    }
}
