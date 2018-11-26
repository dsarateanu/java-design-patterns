package com.home.patterns.creational;

public class BuilderPattern {

	public static class Builder{
		private String field1;
		private String field2;
		private String field3;

		public Builder() {
		}

		public BuilderPattern builder(){
			return new BuilderPattern(this);
		}

		public  Builder field1(String field1){
			this.field1 = field1;
			return this;
		}

		public  Builder field2(String field2){
			this.field2 = field1;
			return this;
		}

		public  Builder field3(String field3){
			this.field3 = field3;
			return this;
		}
	}

	private final String field1;
	private final String field2;
	private final String field3;

	private BuilderPattern(Builder builder) {
		this.field1 = builder.field1;
		this.field2 = builder.field2;
		this.field3 = builder.field3;
	}
}
