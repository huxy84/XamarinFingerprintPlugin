using System;
using System.Threading;
using System.Threading.Tasks;
using Plugin.Fingerprint.Abstractions;

namespace FingerprintPlugin
{
    public class FingerprintService : IFingerprint
    {
        public Task<FingerprintAuthenticationResult> AuthenticateAsync(string reason, CancellationToken cancellationToken = default(CancellationToken))
        {
            return Plugin.Fingerprint.CrossFingerprint.Current.AuthenticateAsync(reason, cancellationToken);
            //var result = new FingerprintAuthenticationResult();
            //result.Authenticated = true;
            //result.Status = FingerprintAuthenticationResultStatus.Succeeded;
        }

        public Task<FingerprintAuthenticationResult> AuthenticateAsync(AuthenticationRequestConfiguration authRequestConfig, CancellationToken cancellationToken = default(CancellationToken))
        {
            throw new NotImplementedException();
        }

        public Task<FingerprintAvailability> GetAvailabilityAsync(bool allowAlternativeAuthentication = false)
        {
            throw new NotImplementedException();
        }

        public Task<bool> IsAvailableAsync(bool allowAlternativeAuthentication = false)
        {
            throw new NotImplementedException();
        }
    }
}
