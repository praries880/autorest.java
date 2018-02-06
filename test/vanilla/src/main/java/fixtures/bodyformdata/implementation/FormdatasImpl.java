/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodyformdata.Formdatas;
import fixtures.bodyformdata.models.ErrorException;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.nio.ByteBuffer;

/**
 * An instance of this class provides access to all the operations defined in
 * Formdatas.
 */
public final class FormdatasImpl implements Formdatas {
    /**
     * The proxy service used to perform REST calls.
     */
    private FormdatasService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATFormDataServiceImpl client;

    /**
     * Initializes an instance of FormdatasImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public FormdatasImpl(AutoRestSwaggerBATFormDataServiceImpl client) {
        this.service = RestProxy.create(FormdatasService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Formdatas to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface FormdatasService {
        // @Multipart not supported by RestProxy
        @POST("formdata/stream/uploadfile")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Flowable<ByteBuffer>>> uploadFile(/* @Part("fileContent") not supported by RestProxy */Flowable<ByteBuffer> fileContent, /* @Part("fileName") not supported by RestProxy */String fileName);

        @PUT("formdata/stream/uploadfile")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Flowable<ByteBuffer>>> uploadFileViaBody(@BodyParam("application/octet-stream") Flowable<ByteBuffer> fileContent);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    public Flowable<ByteBuffer> uploadFile(Flowable<ByteBuffer> fileContent, String fileName) {
        return uploadFileAsync(fileContent, fileName).blockingGet();
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Flowable&lt;ByteBuffer&gt;&gt;} object.
     */
    public ServiceFuture<Flowable<ByteBuffer>> uploadFileAsync(Flowable<ByteBuffer> fileContent, String fileName, ServiceCallback<Flowable<ByteBuffer>> serviceCallback) {
        return ServiceFuture.fromBody(uploadFileAsync(fileContent, fileName), serviceCallback);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Flowable&lt;ByteBuffer&gt;&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Flowable<ByteBuffer>>> uploadFileWithRestResponseAsync(Flowable<ByteBuffer> fileContent, String fileName) {
        if (fileContent == null) {
            throw new IllegalArgumentException("Parameter fileContent is required and cannot be null.");
        }
        if (fileName == null) {
            throw new IllegalArgumentException("Parameter fileName is required and cannot be null.");
        }
        return service.uploadFile(fileContent, fileName);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Flowable&lt;ByteBuffer&gt;&gt;} object if successful.
     */
    public Maybe<Flowable<ByteBuffer>> uploadFileAsync(Flowable<ByteBuffer> fileContent, String fileName) {
        return uploadFileWithRestResponseAsync(fileContent, fileName)
            .flatMapMaybe(new Function<RestResponse<Void, Flowable<ByteBuffer>>, Maybe<Flowable<ByteBuffer>>>() {
                public Maybe<Flowable<ByteBuffer>> apply(RestResponse<Void, Flowable<ByteBuffer>> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;ByteBuffer&gt; object if successful.
     */
    public Flowable<ByteBuffer> uploadFileViaBody(Flowable<ByteBuffer> fileContent) {
        return uploadFileViaBodyAsync(fileContent).blockingGet();
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Flowable&lt;ByteBuffer&gt;&gt;} object.
     */
    public ServiceFuture<Flowable<ByteBuffer>> uploadFileViaBodyAsync(Flowable<ByteBuffer> fileContent, ServiceCallback<Flowable<ByteBuffer>> serviceCallback) {
        return ServiceFuture.fromBody(uploadFileViaBodyAsync(fileContent), serviceCallback);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Flowable&lt;ByteBuffer&gt;&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Flowable<ByteBuffer>>> uploadFileViaBodyWithRestResponseAsync(Flowable<ByteBuffer> fileContent) {
        if (fileContent == null) {
            throw new IllegalArgumentException("Parameter fileContent is required and cannot be null.");
        }
        return service.uploadFileViaBody(fileContent);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Flowable&lt;ByteBuffer&gt;&gt;} object if successful.
     */
    public Maybe<Flowable<ByteBuffer>> uploadFileViaBodyAsync(Flowable<ByteBuffer> fileContent) {
        return uploadFileViaBodyWithRestResponseAsync(fileContent)
            .flatMapMaybe(new Function<RestResponse<Void, Flowable<ByteBuffer>>, Maybe<Flowable<ByteBuffer>>>() {
                public Maybe<Flowable<ByteBuffer>> apply(RestResponse<Void, Flowable<ByteBuffer>> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
