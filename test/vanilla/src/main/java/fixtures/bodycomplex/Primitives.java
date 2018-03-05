/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import fixtures.bodycomplex.models.BooleanWrapper;
import fixtures.bodycomplex.models.ByteWrapper;
import fixtures.bodycomplex.models.Datetimerfc1123Wrapper;
import fixtures.bodycomplex.models.DatetimeWrapper;
import fixtures.bodycomplex.models.DateWrapper;
import fixtures.bodycomplex.models.DoubleWrapper;
import fixtures.bodycomplex.models.DurationWrapper;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.FloatWrapper;
import fixtures.bodycomplex.models.IntWrapper;
import fixtures.bodycomplex.models.LongWrapper;
import fixtures.bodycomplex.models.StringWrapper;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Primitives.
 */
public interface Primitives {
    /**
     * Get complex types with integer properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IntWrapper object if successful.
     */
    IntWrapper getInt();

    /**
     * Get complex types with integer properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<IntWrapper> getIntAsync(ServiceCallback<IntWrapper> serviceCallback);

    /**
     * Get complex types with integer properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<IntWrapper>> getIntWithRestResponseAsync();

    /**
     * Get complex types with integer properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<IntWrapper> getIntAsync();

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putInt(@NonNull IntWrapper complexBody);

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putIntAsync(@NonNull IntWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putIntWithRestResponseAsync(@NonNull IntWrapper complexBody);

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putIntAsync(@NonNull IntWrapper complexBody);

    /**
     * Get complex types with long properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LongWrapper object if successful.
     */
    LongWrapper getLong();

    /**
     * Get complex types with long properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<LongWrapper> getLongAsync(ServiceCallback<LongWrapper> serviceCallback);

    /**
     * Get complex types with long properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<LongWrapper>> getLongWithRestResponseAsync();

    /**
     * Get complex types with long properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<LongWrapper> getLongAsync();

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putLong(@NonNull LongWrapper complexBody);

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putLongAsync(@NonNull LongWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putLongWithRestResponseAsync(@NonNull LongWrapper complexBody);

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putLongAsync(@NonNull LongWrapper complexBody);

    /**
     * Get complex types with float properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the FloatWrapper object if successful.
     */
    FloatWrapper getFloat();

    /**
     * Get complex types with float properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<FloatWrapper> getFloatAsync(ServiceCallback<FloatWrapper> serviceCallback);

    /**
     * Get complex types with float properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<FloatWrapper>> getFloatWithRestResponseAsync();

    /**
     * Get complex types with float properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<FloatWrapper> getFloatAsync();

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putFloat(@NonNull FloatWrapper complexBody);

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putFloatAsync(@NonNull FloatWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putFloatWithRestResponseAsync(@NonNull FloatWrapper complexBody);

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putFloatAsync(@NonNull FloatWrapper complexBody);

    /**
     * Get complex types with double properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DoubleWrapper object if successful.
     */
    DoubleWrapper getDouble();

    /**
     * Get complex types with double properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DoubleWrapper> getDoubleAsync(ServiceCallback<DoubleWrapper> serviceCallback);

    /**
     * Get complex types with double properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<DoubleWrapper>> getDoubleWithRestResponseAsync();

    /**
     * Get complex types with double properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DoubleWrapper> getDoubleAsync();

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putDouble(@NonNull DoubleWrapper complexBody);

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putDoubleAsync(@NonNull DoubleWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putDoubleWithRestResponseAsync(@NonNull DoubleWrapper complexBody);

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putDoubleAsync(@NonNull DoubleWrapper complexBody);

    /**
     * Get complex types with bool properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the BooleanWrapper object if successful.
     */
    BooleanWrapper getBool();

    /**
     * Get complex types with bool properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<BooleanWrapper> getBoolAsync(ServiceCallback<BooleanWrapper> serviceCallback);

    /**
     * Get complex types with bool properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<BooleanWrapper>> getBoolWithRestResponseAsync();

    /**
     * Get complex types with bool properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<BooleanWrapper> getBoolAsync();

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putBool(@NonNull BooleanWrapper complexBody);

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putBoolAsync(@NonNull BooleanWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putBoolWithRestResponseAsync(@NonNull BooleanWrapper complexBody);

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putBoolAsync(@NonNull BooleanWrapper complexBody);

    /**
     * Get complex types with string properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the StringWrapper object if successful.
     */
    StringWrapper getString();

    /**
     * Get complex types with string properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<StringWrapper> getStringAsync(ServiceCallback<StringWrapper> serviceCallback);

    /**
     * Get complex types with string properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<StringWrapper>> getStringWithRestResponseAsync();

    /**
     * Get complex types with string properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<StringWrapper> getStringAsync();

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putString(@NonNull StringWrapper complexBody);

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putStringAsync(@NonNull StringWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putStringWithRestResponseAsync(@NonNull StringWrapper complexBody);

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putStringAsync(@NonNull StringWrapper complexBody);

    /**
     * Get complex types with date properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateWrapper object if successful.
     */
    DateWrapper getDate();

    /**
     * Get complex types with date properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DateWrapper> getDateAsync(ServiceCallback<DateWrapper> serviceCallback);

    /**
     * Get complex types with date properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<DateWrapper>> getDateWithRestResponseAsync();

    /**
     * Get complex types with date properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DateWrapper> getDateAsync();

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putDate(@NonNull DateWrapper complexBody);

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putDateAsync(@NonNull DateWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putDateWithRestResponseAsync(@NonNull DateWrapper complexBody);

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putDateAsync(@NonNull DateWrapper complexBody);

    /**
     * Get complex types with datetime properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DatetimeWrapper object if successful.
     */
    DatetimeWrapper getDateTime();

    /**
     * Get complex types with datetime properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DatetimeWrapper> getDateTimeAsync(ServiceCallback<DatetimeWrapper> serviceCallback);

    /**
     * Get complex types with datetime properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<DatetimeWrapper>> getDateTimeWithRestResponseAsync();

    /**
     * Get complex types with datetime properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DatetimeWrapper> getDateTimeAsync();

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putDateTime(@NonNull DatetimeWrapper complexBody);

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putDateTimeAsync(@NonNull DatetimeWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putDateTimeWithRestResponseAsync(@NonNull DatetimeWrapper complexBody);

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putDateTimeAsync(@NonNull DatetimeWrapper complexBody);

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Datetimerfc1123Wrapper object if successful.
     */
    Datetimerfc1123Wrapper getDateTimeRfc1123();

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Datetimerfc1123Wrapper> getDateTimeRfc1123Async(ServiceCallback<Datetimerfc1123Wrapper> serviceCallback);

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<Datetimerfc1123Wrapper>> getDateTimeRfc1123WithRestResponseAsync();

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<Datetimerfc1123Wrapper> getDateTimeRfc1123Async();

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putDateTimeRfc1123(@NonNull Datetimerfc1123Wrapper complexBody);

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putDateTimeRfc1123Async(@NonNull Datetimerfc1123Wrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putDateTimeRfc1123WithRestResponseAsync(@NonNull Datetimerfc1123Wrapper complexBody);

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putDateTimeRfc1123Async(@NonNull Datetimerfc1123Wrapper complexBody);

    /**
     * Get complex types with duration properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DurationWrapper object if successful.
     */
    DurationWrapper getDuration();

    /**
     * Get complex types with duration properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<DurationWrapper> getDurationAsync(ServiceCallback<DurationWrapper> serviceCallback);

    /**
     * Get complex types with duration properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<DurationWrapper>> getDurationWithRestResponseAsync();

    /**
     * Get complex types with duration properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<DurationWrapper> getDurationAsync();

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putDuration(@NonNull DurationWrapper complexBody);

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putDurationAsync(@NonNull DurationWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putDurationWithRestResponseAsync(@NonNull DurationWrapper complexBody);

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putDurationAsync(@NonNull DurationWrapper complexBody);

    /**
     * Get complex types with byte properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ByteWrapper object if successful.
     */
    ByteWrapper getByte();

    /**
     * Get complex types with byte properties.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<ByteWrapper> getByteAsync(ServiceCallback<ByteWrapper> serviceCallback);

    /**
     * Get complex types with byte properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<ByteWrapper>> getByteWithRestResponseAsync();

    /**
     * Get complex types with byte properties.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<ByteWrapper> getByteAsync();

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putByte(@NonNull ByteWrapper complexBody);

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putByteAsync(@NonNull ByteWrapper complexBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putByteWithRestResponseAsync(@NonNull ByteWrapper complexBody);

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putByteAsync(@NonNull ByteWrapper complexBody);
}
