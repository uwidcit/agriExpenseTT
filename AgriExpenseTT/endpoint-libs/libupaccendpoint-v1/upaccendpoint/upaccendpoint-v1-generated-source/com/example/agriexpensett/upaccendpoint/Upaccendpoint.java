/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-08-05 at 16:52:16 UTC 
 * Modify at your own risk.
 */

package com.example.agriexpensett.upaccendpoint;

/**
 * Service definition for Upaccendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UpaccendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Upaccendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the upaccendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://onyx-park-618.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "upaccendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Upaccendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Upaccendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getUpAcc".
   *
   * This request holds the parameters needed by the the upaccendpoint server.  After setting any
   * optional parameters, call the {@link GetUpAcc#execute()} method to invoke the remote operation.
   *
   * @param id
   * @param acc
   * @return the request
   */
  public GetUpAcc getUpAcc(java.lang.Long id, java.lang.String acc) throws java.io.IOException {
    GetUpAcc result = new GetUpAcc(id, acc);
    initialize(result);
    return result;
  }

  public class GetUpAcc extends UpaccendpointRequest<com.example.agriexpensett.upaccendpoint.model.UpAcc> {

    private static final String REST_PATH = "upacc/{id}/{acc}";

    /**
     * Create a request for the method "getUpAcc".
     *
     * This request holds the parameters needed by the the upaccendpoint server.  After setting any
     * optional parameters, call the {@link GetUpAcc#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetUpAcc#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @param acc
     * @since 1.13
     */
    protected GetUpAcc(java.lang.Long id, java.lang.String acc) {
      super(Upaccendpoint.this, "GET", REST_PATH, null, com.example.agriexpensett.upaccendpoint.model.UpAcc.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
      this.acc = com.google.api.client.util.Preconditions.checkNotNull(acc, "Required parameter acc must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetUpAcc setAlt(java.lang.String alt) {
      return (GetUpAcc) super.setAlt(alt);
    }

    @Override
    public GetUpAcc setFields(java.lang.String fields) {
      return (GetUpAcc) super.setFields(fields);
    }

    @Override
    public GetUpAcc setKey(java.lang.String key) {
      return (GetUpAcc) super.setKey(key);
    }

    @Override
    public GetUpAcc setOauthToken(java.lang.String oauthToken) {
      return (GetUpAcc) super.setOauthToken(oauthToken);
    }

    @Override
    public GetUpAcc setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetUpAcc) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetUpAcc setQuotaUser(java.lang.String quotaUser) {
      return (GetUpAcc) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetUpAcc setUserIp(java.lang.String userIp) {
      return (GetUpAcc) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetUpAcc setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String acc;

    /**

     */
    public java.lang.String getAcc() {
      return acc;
    }

    public GetUpAcc setAcc(java.lang.String acc) {
      this.acc = acc;
      return this;
    }

    @Override
    public GetUpAcc set(String parameterName, Object value) {
      return (GetUpAcc) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertUpAcc".
   *
   * This request holds the parameters needed by the the upaccendpoint server.  After setting any
   * optional parameters, call the {@link InsertUpAcc#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.agriexpensett.upaccendpoint.model.UpAcc}
   * @return the request
   */
  public InsertUpAcc insertUpAcc(com.example.agriexpensett.upaccendpoint.model.UpAcc content) throws java.io.IOException {
    InsertUpAcc result = new InsertUpAcc(content);
    initialize(result);
    return result;
  }

  public class InsertUpAcc extends UpaccendpointRequest<com.example.agriexpensett.upaccendpoint.model.UpAcc> {

    private static final String REST_PATH = "upacc";

    /**
     * Create a request for the method "insertUpAcc".
     *
     * This request holds the parameters needed by the the upaccendpoint server.  After setting any
     * optional parameters, call the {@link InsertUpAcc#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertUpAcc#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.agriexpensett.upaccendpoint.model.UpAcc}
     * @since 1.13
     */
    protected InsertUpAcc(com.example.agriexpensett.upaccendpoint.model.UpAcc content) {
      super(Upaccendpoint.this, "POST", REST_PATH, content, com.example.agriexpensett.upaccendpoint.model.UpAcc.class);
    }

    @Override
    public InsertUpAcc setAlt(java.lang.String alt) {
      return (InsertUpAcc) super.setAlt(alt);
    }

    @Override
    public InsertUpAcc setFields(java.lang.String fields) {
      return (InsertUpAcc) super.setFields(fields);
    }

    @Override
    public InsertUpAcc setKey(java.lang.String key) {
      return (InsertUpAcc) super.setKey(key);
    }

    @Override
    public InsertUpAcc setOauthToken(java.lang.String oauthToken) {
      return (InsertUpAcc) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertUpAcc setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertUpAcc) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertUpAcc setQuotaUser(java.lang.String quotaUser) {
      return (InsertUpAcc) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertUpAcc setUserIp(java.lang.String userIp) {
      return (InsertUpAcc) super.setUserIp(userIp);
    }

    @Override
    public InsertUpAcc set(String parameterName, Object value) {
      return (InsertUpAcc) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listUpAcc".
   *
   * This request holds the parameters needed by the the upaccendpoint server.  After setting any
   * optional parameters, call the {@link ListUpAcc#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListUpAcc listUpAcc() throws java.io.IOException {
    ListUpAcc result = new ListUpAcc();
    initialize(result);
    return result;
  }

  public class ListUpAcc extends UpaccendpointRequest<com.example.agriexpensett.upaccendpoint.model.CollectionResponseUpAcc> {

    private static final String REST_PATH = "upacc";

    /**
     * Create a request for the method "listUpAcc".
     *
     * This request holds the parameters needed by the the upaccendpoint server.  After setting any
     * optional parameters, call the {@link ListUpAcc#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListUpAcc#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListUpAcc() {
      super(Upaccendpoint.this, "GET", REST_PATH, null, com.example.agriexpensett.upaccendpoint.model.CollectionResponseUpAcc.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListUpAcc setAlt(java.lang.String alt) {
      return (ListUpAcc) super.setAlt(alt);
    }

    @Override
    public ListUpAcc setFields(java.lang.String fields) {
      return (ListUpAcc) super.setFields(fields);
    }

    @Override
    public ListUpAcc setKey(java.lang.String key) {
      return (ListUpAcc) super.setKey(key);
    }

    @Override
    public ListUpAcc setOauthToken(java.lang.String oauthToken) {
      return (ListUpAcc) super.setOauthToken(oauthToken);
    }

    @Override
    public ListUpAcc setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListUpAcc) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListUpAcc setQuotaUser(java.lang.String quotaUser) {
      return (ListUpAcc) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListUpAcc setUserIp(java.lang.String userIp) {
      return (ListUpAcc) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListUpAcc setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListUpAcc setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListUpAcc set(String parameterName, Object value) {
      return (ListUpAcc) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeUpAcc".
   *
   * This request holds the parameters needed by the the upaccendpoint server.  After setting any
   * optional parameters, call the {@link RemoveUpAcc#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveUpAcc removeUpAcc(java.lang.Long id) throws java.io.IOException {
    RemoveUpAcc result = new RemoveUpAcc(id);
    initialize(result);
    return result;
  }

  public class RemoveUpAcc extends UpaccendpointRequest<Void> {

    private static final String REST_PATH = "upacc/{id}";

    /**
     * Create a request for the method "removeUpAcc".
     *
     * This request holds the parameters needed by the the upaccendpoint server.  After setting any
     * optional parameters, call the {@link RemoveUpAcc#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveUpAcc#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveUpAcc(java.lang.Long id) {
      super(Upaccendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveUpAcc setAlt(java.lang.String alt) {
      return (RemoveUpAcc) super.setAlt(alt);
    }

    @Override
    public RemoveUpAcc setFields(java.lang.String fields) {
      return (RemoveUpAcc) super.setFields(fields);
    }

    @Override
    public RemoveUpAcc setKey(java.lang.String key) {
      return (RemoveUpAcc) super.setKey(key);
    }

    @Override
    public RemoveUpAcc setOauthToken(java.lang.String oauthToken) {
      return (RemoveUpAcc) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveUpAcc setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveUpAcc) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveUpAcc setQuotaUser(java.lang.String quotaUser) {
      return (RemoveUpAcc) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveUpAcc setUserIp(java.lang.String userIp) {
      return (RemoveUpAcc) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveUpAcc setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveUpAcc set(String parameterName, Object value) {
      return (RemoveUpAcc) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateUpAcc".
   *
   * This request holds the parameters needed by the the upaccendpoint server.  After setting any
   * optional parameters, call the {@link UpdateUpAcc#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.example.agriexpensett.upaccendpoint.model.UpAcc}
   * @return the request
   */
  public UpdateUpAcc updateUpAcc(com.example.agriexpensett.upaccendpoint.model.UpAcc content) throws java.io.IOException {
    UpdateUpAcc result = new UpdateUpAcc(content);
    initialize(result);
    return result;
  }

  public class UpdateUpAcc extends UpaccendpointRequest<Void> {

    private static final String REST_PATH = "void";

    /**
     * Create a request for the method "updateUpAcc".
     *
     * This request holds the parameters needed by the the upaccendpoint server.  After setting any
     * optional parameters, call the {@link UpdateUpAcc#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateUpAcc#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.agriexpensett.upaccendpoint.model.UpAcc}
     * @since 1.13
     */
    protected UpdateUpAcc(com.example.agriexpensett.upaccendpoint.model.UpAcc content) {
      super(Upaccendpoint.this, "PUT", REST_PATH, content, Void.class);
    }

    @Override
    public UpdateUpAcc setAlt(java.lang.String alt) {
      return (UpdateUpAcc) super.setAlt(alt);
    }

    @Override
    public UpdateUpAcc setFields(java.lang.String fields) {
      return (UpdateUpAcc) super.setFields(fields);
    }

    @Override
    public UpdateUpAcc setKey(java.lang.String key) {
      return (UpdateUpAcc) super.setKey(key);
    }

    @Override
    public UpdateUpAcc setOauthToken(java.lang.String oauthToken) {
      return (UpdateUpAcc) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateUpAcc setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateUpAcc) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateUpAcc setQuotaUser(java.lang.String quotaUser) {
      return (UpdateUpAcc) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateUpAcc setUserIp(java.lang.String userIp) {
      return (UpdateUpAcc) super.setUserIp(userIp);
    }

    @Override
    public UpdateUpAcc set(String parameterName, Object value) {
      return (UpdateUpAcc) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Upaccendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Upaccendpoint}. */
    @Override
    public Upaccendpoint build() {
      return new Upaccendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UpaccendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUpaccendpointRequestInitializer(
        UpaccendpointRequestInitializer upaccendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(upaccendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
