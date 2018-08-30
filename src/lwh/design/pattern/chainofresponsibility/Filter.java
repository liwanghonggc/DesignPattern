package lwh.design.pattern.chainofresponsibility;

public interface Filter {

	void doFilter(Request request, Response response, FilterChain chain);
}
