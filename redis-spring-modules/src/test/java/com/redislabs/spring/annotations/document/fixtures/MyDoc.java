package com.redislabs.spring.annotations.document.fixtures;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

import com.redislabs.spring.annotations.Document;
import com.redislabs.spring.annotations.TagIndexed;
import com.redislabs.spring.annotations.TextIndexed;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Document("my-doc")
public class MyDoc {
  @Id
  private String id;
  @NonNull
  @TextIndexed
  private String title;
  @TagIndexed
  private Set<String> tag = new HashSet<String>();
}