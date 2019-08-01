/*
 * Speech Services API v3.0-beta1
 * Speech Services API v3.0-beta1.
 *
 * OpenAPI spec version: v3.0-beta1
 * Contact: crservice@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PathNodeV3;
import io.swagger.client.model.VoiceContentGenerationTaskItemV3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetTasksReponseV3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-02T13:09:27.002+08:00")
public class GetTasksReponseV3 {
  @SerializedName("pathToRoot")
  private List<PathNodeV3> pathToRoot = null;

  @SerializedName("childrenTasks")
  private List<VoiceContentGenerationTaskItemV3> childrenTasks = null;

  public GetTasksReponseV3 pathToRoot(List<PathNodeV3> pathToRoot) {
    this.pathToRoot = pathToRoot;
    return this;
  }

  public GetTasksReponseV3 addPathToRootItem(PathNodeV3 pathToRootItem) {
    if (this.pathToRoot == null) {
      this.pathToRoot = new ArrayList<PathNodeV3>();
    }
    this.pathToRoot.add(pathToRootItem);
    return this;
  }

   /**
   * The path to root by Guid. Pairing with PathToRootByName
   * @return pathToRoot
  **/
  @ApiModelProperty(value = "The path to root by Guid. Pairing with PathToRootByName")
  public List<PathNodeV3> getPathToRoot() {
    return pathToRoot;
  }

  public void setPathToRoot(List<PathNodeV3> pathToRoot) {
    this.pathToRoot = pathToRoot;
  }

  public GetTasksReponseV3 childrenTasks(List<VoiceContentGenerationTaskItemV3> childrenTasks) {
    this.childrenTasks = childrenTasks;
    return this;
  }

  public GetTasksReponseV3 addChildrenTasksItem(VoiceContentGenerationTaskItemV3 childrenTasksItem) {
    if (this.childrenTasks == null) {
      this.childrenTasks = new ArrayList<VoiceContentGenerationTaskItemV3>();
    }
    this.childrenTasks.add(childrenTasksItem);
    return this;
  }

   /**
   * The children tasks under the folder
   * @return childrenTasks
  **/
  @ApiModelProperty(value = "The children tasks under the folder")
  public List<VoiceContentGenerationTaskItemV3> getChildrenTasks() {
    return childrenTasks;
  }

  public void setChildrenTasks(List<VoiceContentGenerationTaskItemV3> childrenTasks) {
    this.childrenTasks = childrenTasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTasksReponseV3 getTasksReponseV3 = (GetTasksReponseV3) o;
    return Objects.equals(this.pathToRoot, getTasksReponseV3.pathToRoot) &&
        Objects.equals(this.childrenTasks, getTasksReponseV3.childrenTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathToRoot, childrenTasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTasksReponseV3 {\n");
    
    sb.append("    pathToRoot: ").append(toIndentedString(pathToRoot)).append("\n");
    sb.append("    childrenTasks: ").append(toIndentedString(childrenTasks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
