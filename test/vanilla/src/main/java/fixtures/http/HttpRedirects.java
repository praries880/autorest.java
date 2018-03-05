/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.http.models.ErrorException;
import fixtures.http.models.HttpRedirectsDelete307Response;
import fixtures.http.models.HttpRedirectsGet300Response;
import fixtures.http.models.HttpRedirectsGet301Response;
import fixtures.http.models.HttpRedirectsGet302Response;
import fixtures.http.models.HttpRedirectsGet307Response;
import fixtures.http.models.HttpRedirectsHead300Response;
import fixtures.http.models.HttpRedirectsHead301Response;
import fixtures.http.models.HttpRedirectsHead302Response;
import fixtures.http.models.HttpRedirectsHead307Response;
import fixtures.http.models.HttpRedirectsPatch302Response;
import fixtures.http.models.HttpRedirectsPatch307Response;
import fixtures.http.models.HttpRedirectsPost303Response;
import fixtures.http.models.HttpRedirectsPost307Response;
import fixtures.http.models.HttpRedirectsPut301Response;
import fixtures.http.models.HttpRedirectsPut307Response;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpRedirects.
 */
public interface HttpRedirects {
    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head300();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> head300Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsHead300Response> head300WithRestResponseAsync();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable head300Async();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;String&gt; object if successful.
     */
    List<String> get300();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<List<String>> get300Async(ServiceCallback<List<String>> serviceCallback);

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsGet300Response> get300WithRestResponseAsync();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<List<String>> get300Async();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head301();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> head301Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsHead301Response> head301WithRestResponseAsync();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable head301Async();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void get301();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> get301Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsGet301Response> get301WithRestResponseAsync();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable get301Async();

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void put301();

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> put301Async(ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPut301Response> put301WithRestResponseAsync();

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable put301Async();

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void put301(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> put301Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPut301Response> put301WithRestResponseAsync(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable put301Async(Boolean booleanValue);

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head302();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> head302Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsHead302Response> head302WithRestResponseAsync();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable head302Async();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void get302();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> get302Async(ServiceCallback<Void> serviceCallback);

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsGet302Response> get302WithRestResponseAsync();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable get302Async();

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void patch302();

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> patch302Async(ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPatch302Response> patch302WithRestResponseAsync();

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable patch302Async();

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void patch302(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> patch302Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPatch302Response> patch302WithRestResponseAsync(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable patch302Async(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void post303();

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> post303Async(ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPost303Response> post303WithRestResponseAsync();

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable post303Async();

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void post303(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> post303Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPost303Response> post303WithRestResponseAsync(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable post303Async(Boolean booleanValue);

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void head307();

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> head307Async(ServiceCallback<Void> serviceCallback);

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsHead307Response> head307WithRestResponseAsync();

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable head307Async();

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void get307();

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> get307Async(ServiceCallback<Void> serviceCallback);

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsGet307Response> get307WithRestResponseAsync();

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable get307Async();

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void put307();

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> put307Async(ServiceCallback<Void> serviceCallback);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPut307Response> put307WithRestResponseAsync();

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable put307Async();

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void put307(Boolean booleanValue);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> put307Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPut307Response> put307WithRestResponseAsync(Boolean booleanValue);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable put307Async(Boolean booleanValue);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void patch307();

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> patch307Async(ServiceCallback<Void> serviceCallback);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPatch307Response> patch307WithRestResponseAsync();

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable patch307Async();

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void patch307(Boolean booleanValue);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> patch307Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPatch307Response> patch307WithRestResponseAsync(Boolean booleanValue);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable patch307Async(Boolean booleanValue);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void post307();

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> post307Async(ServiceCallback<Void> serviceCallback);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPost307Response> post307WithRestResponseAsync();

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable post307Async();

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void post307(Boolean booleanValue);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> post307Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsPost307Response> post307WithRestResponseAsync(Boolean booleanValue);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable post307Async(Boolean booleanValue);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete307();

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> delete307Async(ServiceCallback<Void> serviceCallback);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsDelete307Response> delete307WithRestResponseAsync();

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Completable delete307Async();

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete307(Boolean booleanValue);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> delete307Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<HttpRedirectsDelete307Response> delete307WithRestResponseAsync(Boolean booleanValue);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable delete307Async(Boolean booleanValue);
}
