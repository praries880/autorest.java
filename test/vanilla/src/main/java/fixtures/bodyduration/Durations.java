/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import fixtures.bodyduration.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import org.joda.time.Period;

/**
 * An instance of this class provides access to all the operations defined in
 * Durations.
 */
public interface Durations {
    /**
     * Get null duration value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Period object if successful.
     */
    Period getNull();

    /**
     * Get null duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Period> getNullAsync(ServiceCallback<Period> serviceCallback);

    /**
     * Get null duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<Period>> getNullWithRestResponseAsync();

    /**
     * Get null duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Period> getNullAsync();

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putPositiveDuration(@NonNull Period durationBody);

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putPositiveDurationAsync(@NonNull Period durationBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putPositiveDurationWithRestResponseAsync(@NonNull Period durationBody);

    /**
     * Put a positive duration value.
     *
     * @param durationBody the Period value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putPositiveDurationAsync(@NonNull Period durationBody);

    /**
     * Get a positive duration value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Period object if successful.
     */
    Period getPositiveDuration();

    /**
     * Get a positive duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Period> getPositiveDurationAsync(ServiceCallback<Period> serviceCallback);

    /**
     * Get a positive duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<Period>> getPositiveDurationWithRestResponseAsync();

    /**
     * Get a positive duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Period> getPositiveDurationAsync();

    /**
     * Get an invalid duration value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Period object if successful.
     */
    Period getInvalid();

    /**
     * Get an invalid duration value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Period> getInvalidAsync(ServiceCallback<Period> serviceCallback);

    /**
     * Get an invalid duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<Period>> getInvalidWithRestResponseAsync();

    /**
     * Get an invalid duration value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Period> getInvalidAsync();
}
