/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.StreamResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodyfile.Files;
import fixtures.bodyfile.models.ErrorException;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.nio.ByteBuffer;

/**
 * An instance of this class provides access to all the operations defined in
 * Files.
 */
public final class FilesImpl implements Files {
    /**
     * The proxy service used to perform REST calls.
     */
    private FilesService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATFileServiceImpl client;

    /**
     * Initializes an instance of FilesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public FilesImpl(AutoRestSwaggerBATFileServiceImpl client) {
        this.service = RestProxy.create(FilesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Files to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface FilesService {
        @GET("files/stream/nonempty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<StreamResponse> getFile();

        @GET("files/stream/verylarge")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<StreamResponse> getFileLarge();

        @GET("files/stream/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<StreamResponse> getEmptyFile();
    }

    /**
     * Get file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    public Flowable<ByteBuffer> getFile() {
        return getFileAsync().blockingGet();
    }

    /**
     * Get file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Flowable<ByteBuffer>> getFileAsync(ServiceCallback<Flowable<ByteBuffer>> serviceCallback) {
        return ServiceFuture.fromBody(getFileAsync(), serviceCallback);
    }

    /**
     * Get file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<StreamResponse> getFileWithRestResponseAsync() {
        return service.getFile();
    }

    /**
     * Get file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Flowable<ByteBuffer>> getFileAsync() {
        return getFileWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get a large file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    public Flowable<ByteBuffer> getFileLarge() {
        return getFileLargeAsync().blockingGet();
    }

    /**
     * Get a large file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Flowable<ByteBuffer>> getFileLargeAsync(ServiceCallback<Flowable<ByteBuffer>> serviceCallback) {
        return ServiceFuture.fromBody(getFileLargeAsync(), serviceCallback);
    }

    /**
     * Get a large file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<StreamResponse> getFileLargeWithRestResponseAsync() {
        return service.getFileLarge();
    }

    /**
     * Get a large file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Flowable<ByteBuffer>> getFileLargeAsync() {
        return getFileLargeWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get empty file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    public Flowable<ByteBuffer> getEmptyFile() {
        return getEmptyFileAsync().blockingGet();
    }

    /**
     * Get empty file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Flowable<ByteBuffer>> getEmptyFileAsync(ServiceCallback<Flowable<ByteBuffer>> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyFileAsync(), serviceCallback);
    }

    /**
     * Get empty file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<StreamResponse> getEmptyFileWithRestResponseAsync() {
        return service.getEmptyFile();
    }

    /**
     * Get empty file.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Flowable<ByteBuffer>> getEmptyFileAsync() {
        return getEmptyFileWithRestResponseAsync()
            .flatMapMaybe(res -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
