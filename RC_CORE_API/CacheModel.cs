using Microsoft.Extensions.Caching.Memory;

namespace RC_Core_API
{
    public static class CacheModel
    {
        private static IMemoryCache mrm = new MemoryCache(new MemoryCacheOptions());
        
        public static void Add(string key,int value)
        {
            var cacheExpireOptions = new MemoryCacheEntryOptions()
            {
               
                Priority = CacheItemPriority.NeverRemove,
                
            };
            
                mrm.Set(key, value, cacheExpireOptions);
            
            
        }

        public static int Get(string key)
        {
            var result = mrm.Get(key);
            return Convert.ToInt32(result);
        }

        public static void Delete(string key)
        {
            if(mrm.Get(key)!=null)
                mrm.Remove(key);    
        }


    }
}
