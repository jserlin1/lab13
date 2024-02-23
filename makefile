JC = javac
JFLAGS = -g

default:
	$(JC) $(JFLAGS) Driver.java

#The \ works as a line delimiter. It will concatenate the stringss on each line so the commands must be separated by semicolons
clean:
	rm *~; \
	rm *.class; \
	rm animal/*.class; \
	rm animal/*~; \
	rm animal/mammal/*.class \
	rm animal/mammal/*~;
