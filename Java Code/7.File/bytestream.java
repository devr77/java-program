12.6 Byte Streams

Byte Stream
Byte streams process data byte by byte (8 bits). For example FileInputStream is used to read from source and FileOutputStream to write to the destination.
low level stream:
sub class of io streams are called low level streams.
they does not depend on other streams.

￼


Low level Streams are: 

BufferedInputStream 
ByteArrayInputStream
DataInputStream
FileInputStream
FilterInputStream
ObjectInputStream
PipedInputStream
SequenceInputStream
BufferedOutputStream
ByteArrayOutputStream
DataOutputStream
FileOutputStream
FilterOutputStream
ObjectOutputStream
PipedOutputStream
PrintStream

High level stream :
-sub class of Filter I\O Streams 
-they add extra functionality to the low level streams
-they always depend on low level stream.
Filter IO(High level stream) are:
- DataInputStream and DataOutputStream
-LineNumberInputStream
-BufferedInputStream and BufferedOutputStream.
-PushbackInputStream

When to use Character Stream over Byte Stream?

In Java, characters are stored using Unicode conventions. Character stream is useful when we want to process text files. These text files can be processed character by character. A character size is typically 16 bits.


When to use Byte Stream over Character Stream?

Byte oriented reads byte by byte. A byte stream is suitable for processing raw data like binary files.

