package jwt.project.jwtback.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.graphql.server.GraphQlRSocketHandler;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

  private String targetString = "testAString";

  // 이 annotation은
  @QueryMapping
  public String someMethod() {
    return "TEST";
  }

  // 이 annotaton을 쓴 것과 같음
  // @SchemaMapping(typeName = "Query")
  // public String someMethod() {
  // return "TEST";
  // }

  @MutationMapping
  public String someMethodUpdate(@Argument String changeValue) {
    targetString = changeValue;
    return targetString;
  }

  // @SchemaMapping(typeName = "Mutation")
  // public String someMethodUpdate(@Argument String changeValue) {
  // targetString = changeValue
  // return targetString;
  // }
}
