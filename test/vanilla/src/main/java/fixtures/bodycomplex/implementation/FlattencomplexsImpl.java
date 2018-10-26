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

import retrofit2.Retrofit;
import fixtures.bodycomplex.Flattencomplexs;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodycomplex.models.MyBaseType;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Flattencomplexs.
 */
public class FlattencomplexsImpl implements Flattencomplexs {
    /** The Retrofit service to perform REST calls. */
    private FlattencomplexsService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Flattencomplexs.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FlattencomplexsImpl(Retrofit retrofit, AutoRestComplexTestServiceImpl client) {
        this.service = retrofit.create(FlattencomplexsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Flattencomplexs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FlattencomplexsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodycomplex.Flattencomplexs getValid" })
        @GET("complex/flatten/valid")
        Observable<Response<ResponseBody>> getValid();

    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MyBaseType object if successful.
     */
    public MyBaseType getValid() {
        return getValidWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MyBaseType> getValidAsync(final ServiceCallback<MyBaseType> serviceCallback) {
        return ServiceFuture.fromResponse(getValidWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MyBaseType object
     */
    public Observable<MyBaseType> getValidAsync() {
        return getValidWithServiceResponseAsync().map(new Func1<ServiceResponse<MyBaseType>, MyBaseType>() {
            @Override
            public MyBaseType call(ServiceResponse<MyBaseType> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MyBaseType object
     */
    public Observable<ServiceResponse<MyBaseType>> getValidWithServiceResponseAsync() {
        return service.getValid()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MyBaseType>>>() {
                @Override
                public Observable<ServiceResponse<MyBaseType>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MyBaseType> clientResponse = getValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MyBaseType> getValidDelegate(Response<ResponseBody> response) throws RestException, IOException {
        return this.client.restClient().responseBuilderFactory().<MyBaseType, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MyBaseType>() { }.getType())
                .build(response);
    }

}