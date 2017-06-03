# designPattern
通过setImageCache(ImageCache cache)方法注入不同的缓存实现，这样不仅能够使ImageLoader更简单、健壮，也使得ImageLoader的可扩展性、灵活性更高。

MemoryCache、DiskCache、DoubleCache缓存图片的具体实现完全不一样，但是，它们的一个特点是，都实现了ImageCache接口。

用户需要自定义实现缓存策略时，只需要新建一个实现ImageCache接口的类，然后构造该类的对象，并且通过setImageCache(ImageCache cache)注入到ImageLoader中，
这样ImageLoader就实现了千变万化的缓存策略，且扩展这些缓存策略并不会导致ImageLoader类的修改
![image](http://github.com/qqhahaboy/designPattern/raw/master/imageloader/images/uml.jpg)
