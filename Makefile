BLDPATH=build
SRCPATH=src
LIBPATH=lib/choco-solver-4.10.6-jar-with-dependencies.jar
CC=javac

all :
	$(CC) -d $(BLDPATH) -cp '$(BLDPATH);$(LIBPATH)' $(SRCPATH)/*.java

run : all
	java -cp '$(BLDPATH)' Main

%.java : all
	java -cp '$(BLDPATH)' $*

clean :
	rm -rf $(BLDPATH)/*.class

