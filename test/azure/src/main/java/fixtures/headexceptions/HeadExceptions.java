/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.headexceptions;

import com.microsoft.azure.v2.CloudException;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import io.reactivex.Completable;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * HeadExceptions.
 */
public interface HeadExceptions {
    /**
     * Return 200 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head200();

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> head200Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 200 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> head200WithRestResponseAsync();

    /**
     * Return 200 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable head200Async();

    /**
     * Return 204 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head204();

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> head204Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 204 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> head204WithRestResponseAsync();

    /**
     * Return 204 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable head204Async();

    /**
     * Return 404 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head404();

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> head404Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 404 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> head404WithRestResponseAsync();

    /**
     * Return 404 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable head404Async();
}
