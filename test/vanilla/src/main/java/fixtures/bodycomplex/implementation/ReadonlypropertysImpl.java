/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodycomplex.Readonlypropertys;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.ReadonlyObj;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Readonlypropertys.
 */
public class ReadonlypropertysImpl implements Readonlypropertys {
    /**
     * The RestProxy service to perform REST calls.
     */
    private ReadonlypropertysService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Readonlypropertys.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ReadonlypropertysImpl(AutoRestComplexTestServiceImpl client) {
        this.service = RestProxy.create(ReadonlypropertysService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Readonlypropertys to be used
     * by RestProxy to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface ReadonlypropertysService {
        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Readonlypropertys getValid" })
        @GET("complex/readonlyproperty/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, ReadonlyObj>> getValid();

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Readonlypropertys putValid" })
        @PUT("complex/readonlyproperty/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putValid(@BodyParam("application/json; charset=utf-8") ReadonlyObj complexBody);

    }

    /**
     * Get complex types that have readonly properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ReadonlyObj object if successful.
     */
    public ReadonlyObj getValid() {
        return getValidAsync().blockingGet();
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ReadonlyObj> getValidAsync(ServiceCallback<ReadonlyObj> serviceCallback) {
        return ServiceFuture.fromBody(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, ReadonlyObj> object
     */
    public Single<RestResponse<Void, ReadonlyObj>> getValidWithRestResponseAsync() {
        return service.getValid();
    }

    /**
     * Get complex types that have readonly properties.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, ReadonlyObj> object
     */
    public Maybe<ReadonlyObj> getValidAsync() {
        return getValidWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, ReadonlyObj>, Maybe<ReadonlyObj>>() {
                public Maybe<ReadonlyObj> apply(RestResponse<Void, ReadonlyObj> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putValid(ReadonlyObj complexBody) {
        putValidAsync(complexBody).blockingAwait();
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidAsync(ReadonlyObj complexBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putValidWithRestResponseAsync(ReadonlyObj complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody);
    }

    /**
     * Put complex types that have readonly properties.
     *
     * @param complexBody the ReadonlyObj value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putValidAsync(ReadonlyObj complexBody) {
        return putValidWithRestResponseAsync(complexBody)
            .toCompletable();
        }


}
